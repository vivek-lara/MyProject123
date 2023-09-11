import { Component } from '@angular/core';
import {FormGroup,FormControl,FormBuilder, Validators} from '@angular/forms';
import { AdminServiceService } from '../admin-service.service';


@Component({
  selector: 'app-change-password',
  templateUrl: './change-password.component.html',
  styleUrls: ['./change-password.component.css']
})
export class ChangePasswordComponent {

  changePasswordForm:FormGroup;
  submitted = false;
  constructor(private formBuilder:FormBuilder, private service:AdminServiceService)
  {
    this.changePasswordForm =  formBuilder.group({
      email: new FormControl(),
      oldPassword: new FormControl(),
      newPassword: new FormControl(),
      confirmPassword: new FormControl()
    });
  }
  ngOnInit(){
    this.changePasswordForm = this.formBuilder.group({
      email:['',Validators.required],
      oldPassword:['',Validators.required],
      newPassword:['',[Validators.required,Validators.minLength(6)]],
      confirmPassword:['',Validators.required]

    })
  }

  changePassword()
  {
    debugger;
    this.submitted = true
    if(this.changePasswordForm.invalid){
      return
    }
    this.service.changePassword(this.changePasswordForm.value).subscribe(
      r4 => {
        console.log(r4);
      }
    )
  }

}
