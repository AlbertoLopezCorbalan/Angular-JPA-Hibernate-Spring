import { Component, OnInit } from '@angular/core';
import { Medico } from '../medico';
import { MedicoService } from '../medico.service';

@Component({
  selector: 'app-medicos',
  templateUrl: './medicos.component.html',
  styleUrls: ['./medicos.component.css']
})
export class MedicosComponent implements OnInit {

  medicos ?: Medico[];
  constructor(private medicoService : MedicoService) { }

  ngOnInit(): void {
    this.medicoService.getMedicos().subscribe((data: Medico[]) => {
      //console.log(data);
      this.medicos = data;
    });
  }

}
