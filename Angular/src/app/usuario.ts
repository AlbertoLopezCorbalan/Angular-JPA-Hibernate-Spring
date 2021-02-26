export abstract class Usuario {
    id : number;
    nombre : string;
    apellidos : string;
    usuario : string;
    clave : string;

    constructor() {
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        this.usuario = "";
        this.clave = "";
    }

}
