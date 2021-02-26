import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Cita } from './cita';

@Injectable({
  providedIn: 'root'
})
export class CitaService {
  private baseUrl = "http://localhost:8080/citas/todas"
  private basePostUrl = "http://localhost:8080/citas/cita"

  constructor(private http: HttpClient) { }

  getCitas() : Observable<Cita[]>{
    return this.http.get<Cita[]>(`${this.baseUrl}`);
  }


  public save(cita: Cita) {
    return this.http.post<Cita>(this.basePostUrl, cita);
  }

}
