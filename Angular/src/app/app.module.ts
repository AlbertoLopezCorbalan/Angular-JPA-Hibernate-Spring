import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MedicosComponent } from './medicos/medicos.component';
import { CitasComponent } from './citas/citas.component';
import { CitasFormComponent } from './citas-form/citas-form.component';
import { PacienteFormComponent } from './paciente-form/paciente-form.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    MedicosComponent,
    CitasComponent,
    CitasFormComponent,
    PacienteFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
