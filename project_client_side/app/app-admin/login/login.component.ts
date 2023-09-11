import { Component } from '@angular/core';
import {FormGroup,FormBuilder,FormControl} from '@angular/forms';
import { AdminServiceService } from '../admin-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
   loginForm:FormGroup;
   forgottenPasswordForm:FormGroup;
   forgottenPasswordEnabled:boolean = false;
   

   constructor(private formBuilder:FormBuilder, private service:AdminServiceService)
   {
    this.loginForm = formBuilder.group({
      email: new FormControl(),
      password: new FormControl()
    });
    this.forgottenPasswordForm = formBuilder.group({
      email:new FormControl()
    });
   }

   authenticate()
   {
     this.service.login(this.loginForm.value).subscribe(
      r1 => {
        console.log(r1);

        if(r1.status)
        {
          console.log(this.loginForm.value["email"]);
          sessionStorage.setItem("email", this.loginForm.value["email"]);
        }
      }
      
     )
   }

   sendMailOnForgottenPassword()
   {
    this.service.sendMailOnForgottenPassword(this.forgottenPasswordForm.value).subscribe(
      r2 => {
        console.log(r2);
      }
    )
   }
   forgottenPassword()
   {
    this.forgottenPasswordEnabled = ! this.forgottenPasswordEnabled;
   }

}
