create database repechaje;
use repechaje;

create table Usuario(ci int not null, nombre varchar(25), apellido varchar(25), primary key(ci));
create table Profesor(ci int not null, matricula int, primary key(ci), foreign key(ci) references Usuario, unique(matricula));
create table Estudiante(ci int not null, nroEstudiante int auto_increment, primary key(ci), foreign key(ci) references Usuario, unique(nroEstudiante));
create table Materia(codigo int, nombre varchar(25), primary key(codigo));
