import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrouillonComponent } from './brouillon/brouillon.component';
import { TestComponent } from './test/test.component';
import { BarroComponent } from './barro/barro.component';

@NgModule({
  declarations: [
    AppComponent,
    BrouillonComponent,
    TestComponent,
    BarroComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
