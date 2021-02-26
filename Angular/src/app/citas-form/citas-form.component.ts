import { Component, OnInit } from '@angular/core';
import { Cita } from '../cita';
import { CitaService } from '../cita.service';
import { Medico } from '../medico';
import { MedicoService } from '../medico.service';
import { Paciente } from '../paciente';
import { PacienteService } from '../paciente.service';

@Component({
  selector: 'app-citas-form',
  templateUrl: './citas-form.component.html',
  styleUrls: ['./citas-form.component.css']
})
export class CitasFormComponent implements OnInit {

  cita: Cita; // Para el POST

  medicos ?: Medico[]; // Para el select
  pacientes ?: Paciente[]; // Para el select

  constructor(private medicoService: MedicoService, private pacienteService: PacienteService, private citaService: CitaService) { this.cita = new Cita()}

  ngOnInit(): void {
    this.medicoService.getMedicos().subscribe((data: Medico[]) => {
      this.medicos = data;
    });

    this.pacienteService.getPacientes().subscribe((data: Paciente[]) => {
      this.pacientes = data;
    });

  }

  onSubmit() {
    this.citaService.save(this.cita).subscribe(result => this.refresh());
  }

  refresh() {
    window.location.reload();
  }

}
