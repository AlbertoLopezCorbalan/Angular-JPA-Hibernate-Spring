import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Diagnostico } from './diagnostico';

@Injectable({
  providedIn: 'root'
})
export class DiagnosticoService {

  private baseUrl = "http://localhost:8080/citas/diagnosticos"

  constructor(private http: HttpClient) { }

  getDiagnosticos() : Observable<Diagnostico[]>{
    return this.http.get<Diagnostico[]>(`${this.baseUrl}`);
  }
}
