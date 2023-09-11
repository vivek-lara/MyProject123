import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AppAdminRoutingModule } from './app-admin-routing.module';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { ChangePasswordComponent } from './change-password/change-password.component';
import { LogoutComponent } from './logout/logout.component';


@NgModule({
  declarations: [
    SignupComponent,
    LoginComponent,
    ChangePasswordComponent,
    LogoutComponent,
   
  ],
  imports: [
    CommonModule,
    AppAdminRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ]
})
export class AppAdminModule { }
