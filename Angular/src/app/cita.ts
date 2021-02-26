import { Diagnostico } from "./diagnostico";
import { Medico } from "./medico";
import { Paciente } from "./paciente";

export class Cita {
    id: number;
    fechaHora: Date;
    motivoCita: string;
    diagnostico: Diagnostico;
    medico: Medico;
    paciente: Paciente;

    constructor() {
        this.id = 0;
        this.fechaHora = new Date();
        this.motivoCita = ""
        this.diagnostico = new Diagnostico();
        this.medico = new Medico();
        this.paciente = new Paciente();
    }

}
