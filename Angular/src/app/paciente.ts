import { ThisReceiver } from "@angular/compiler";
import { Cita } from "./cita";
import { Medico } from "./medico";
import { Usuario } from "./usuario";

export class Paciente extends Usuario{
  id : number;
  nss : string;
  numTarjeta : string;
  telefono : string;
  direccion : string;
  medicos : Medico [];
  citas : Cita [];


  constructor() {
      super();
      this.id = 0;
      this.nss = "";
      this.numTarjeta = "";
      this.telefono = "";
      this.direccion = "";
      this.medicos = [];
      this.citas = [];
  }
}
