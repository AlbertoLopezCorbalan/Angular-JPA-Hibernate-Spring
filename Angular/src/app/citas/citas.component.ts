import { Component, OnInit } from '@angular/core';
import { Cita } from '../cita';
import { CitaService } from '../cita.service';

@Component({
  selector: 'app-citas',
  templateUrl: './citas.component.html',
  styleUrls: ['./citas.component.css']
})
export class CitasComponent implements OnInit {

  citas ?: Cita[];
  constructor(private citaServicio : CitaService) { }

  ngOnInit(): void {
    this.citaServicio.getCitas().subscribe((data: Cita[]) => {
      //console.log(data);
      this.citas = data;
    });
  }

}
