import { Component } from '@angular/core';
import {FormGroup,FormBuilder,FormControl, Validators} from '@angular/forms';
import { AdminServiceService } from '../admin-service.service';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
   signupForm:FormGroup
   submitted = false;
   constructor(private formBuilder:FormBuilder, private service:AdminServiceService)
   {
    this.signupForm = this.formBuilder.group({
      firstName:new FormControl(),
      lastName:new FormControl(),
       email: new FormControl(),
       password: new FormControl()
    })
   }
   ngOnInit()
   {
    this.signupForm = this.formBuilder.group({
           
      firstName:['',Validators.required],
      lastName:['',Validators.required],
      email:['',[Validators.required,Validators.email]],
      password:['',[Validators.required,Validators.minLength(6)]],
     })
   }

   signup()
   {
    this.submitted = true
    if(this.signupForm.invalid){
      return
    }
   // alert("success");
     this.service.signup(this.signupForm.value).subscribe(
      r1 => {
        console.log(r1);
      }
     )
   }
}

