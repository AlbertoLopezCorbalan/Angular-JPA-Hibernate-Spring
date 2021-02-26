import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Usuario } from './usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private baseUrl = "http://localhost:8080/usuarios/todos"

  constructor(private http: HttpClient) { }

  getUsuarios() : Observable<Usuario[]>{
    return this.http.get<Usuario[]>(`${this.baseUrl}`);
  }
}
