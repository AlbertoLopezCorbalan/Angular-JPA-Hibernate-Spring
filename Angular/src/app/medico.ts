import { Cita } from "./cita";
import { Paciente } from "./paciente";
import { Usuario } from "./usuario";

export class Medico extends Usuario{
    id : number;
    numColegiado :  number;
    citas : Cita[];
    pacientes : Paciente[];


    constructor() {
        super();
        this.id = 0;
        this.numColegiado = 0
        this.citas = [];
        this.pacientes = [];
    }
}
