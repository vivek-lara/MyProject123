import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'project1';

  isLoggedIn()
  {
    var status = false;
    if(sessionStorage.getItem("email"))
    {
      status=true;
    }
    return status;
  }
  
}
