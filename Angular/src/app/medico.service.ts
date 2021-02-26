import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Medico } from './medico';

@Injectable({
  providedIn: 'root'
})
export class MedicoService {

  private baseUrl = "http://localhost:8080/usuarios/medicos"

  constructor(private http: HttpClient) { }

  getMedicos() : Observable<Medico[]>{
    return this.http.get<Medico[]>(`${this.baseUrl}`);
  }
}
