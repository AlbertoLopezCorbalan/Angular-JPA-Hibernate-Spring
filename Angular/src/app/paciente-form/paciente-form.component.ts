import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Medico } from '../medico';
import { MedicoService } from '../medico.service';
import { Paciente } from '../paciente';
import { PacienteService } from '../paciente.service';

@Component({
  selector: 'app-paciente-form',
  templateUrl: './paciente-form.component.html',
  styleUrls: ['./paciente-form.component.css']
})
export class PacienteFormComponent implements OnInit {

  paciente: Paciente;

  constructor(private route: ActivatedRoute, private router: Router, private pacienteService: PacienteService) { this.paciente = new Paciente()}

  ngOnInit(): void {
  }

  onSubmit() {
    this.pacienteService.save(this.paciente).subscribe(result => this.refresh());
  }

  refresh() {
    window.location.reload();
  }
}
