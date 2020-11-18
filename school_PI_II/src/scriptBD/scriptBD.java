/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scriptBD;

/**
 *
 * @author olive
 */
public class scriptBD {
    /*#drop database school_pi;
create database if not exists school_pi;
use school_pi;

create table login  (
id_login int not null auto_increment,
login varchar(20),
senha varchar(20),
PRIMARY KEY (id_login)
);

create table estudante (
id_estudante int not null auto_increment,
ra varchar(20),
nome_estudante varchar(40),
primary key(id_estudante)
);

create table responsavel (
id_responsavel int not null auto_increment,
nome_responsavel varchar(40),
cpf varchar(40),
primary key(id_responsavel)
);

create table escola (
ID_Escola int not null auto_increment,
DiretoriaEnsino varchar(50),
NomeEscola varchar(100),
Municipio varchar(50),
Bairro varchar(50),
Distrito varchar(50),
CEP int,
Complemento varchar(50),
Endereco varchar(50),
Numero int,
Ddd int, 
Fone1 int,
Fone2 int,
Email varchar(50),
primary key (id_escola)
);

create table email (
id_email int not null auto_increment,
email varchar(40),
primary key(id_email)
);

create table responsavelemail (
id_responsavelemail int not null auto_increment,
id_email int,
primary key(id_responsavelemail),
foreign key (id_email) references email(id_email)
);

create table  estudanteemail (
id_estudanteemail int not null auto_increment,
id_email int,
id_estudante int,
primary key(id_estudanteemail),
foreign key (id_email) references email(id_email)
);

create table  escolaemail (
id_escolaemail int not null auto_increment,
id_email int,
primary key(id_escolaemail),
foreign key (id_email) references email(id_email)
);

create table telefone (
id_telefone int not null auto_increment,
telefone varchar(20),
numero varchar(20),
primary key(id_telefone)
);
create table responsaveltelefone (
id_responsaveltelefone int not null auto_increment,
id_telefone int,
primary key(id_responsaveltelefone)
);
create table estudantetelefone (
id_estudantetelefone int not null auto_increment,
id_telefone int,
primary key(id_estudantetelefone)
);
create table escolatelefone (
id_escolatelefone int not null auto_increment,
id_telefone int,
primary key(id_escolatelefone)
);

*/
    
}
