import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Paciente } from './paciente';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PacienteService {

  private baseUrl = "http://localhost:8080/usuarios/pacientes"
  private basePostUrl = "http://localhost:8080/usuarios/paciente"

  constructor(private http: HttpClient) { }

  getPacientes() : Observable<Paciente[]>{
    return this.http.get<Paciente[]>(`${this.baseUrl}`);
  }


  save(paciente: Paciente) {
    return this.http.post<Paciente>(this.basePostUrl, paciente);
  }

}
