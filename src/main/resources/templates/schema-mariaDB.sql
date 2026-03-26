create table libro(
    id int primary key auto_increment,
    name varchar(200) not null,
    description varchar(3000),
    image_url varchar(500)
);

insert into libro(name, description, image_url) values
('Derecho y Comercio Electrónico','Aunque desde hace muchos años se vienen dilucidando los cambios que las nuevas tecnologías han causado en las diferentes esferas de la sociedad, 
con frecuencia se resta importancia a las discusiones o estudios sobre las reformas jurídicas que deben hacerse respecto a las necesidades
que el uso de las tecnologías ha generado en nuestra sociedad.','https://simehbucket.s3.amazonaws.com/images/63d2d1100b1ef210c5a54b51e71a995a-medium.jpg'),
('My Dress-Up Darling Vol. 1', 'Marin Kitagawa es una chica popular y atractiva que siempre está en el centro de su círculo de amigos. 
Para su compañero de clase Wakana Gojo, 
era casi como si ella viviera en un mundo aparte.','https://amaterasustore.co/wp-content/uploads/2023/08/my-dress-up-darling-panini-1.webp'),
('Tras las Huellas del Cyberbullying','Tras las huellas del cyberbullying: experiencias de investigación se presenta como un compendio de conocimiento que profundiza en esta clase de acoso.
 Esta obra surge de una colaboración entre el Grupo de Investigación SÍMILES de la Universidad Pedagógica y Tecnológica de Colombia, Seccional Duitama, 
 investigadores de México y la UPTC, y ofrece una visión comprehensiva del en el entorno escolar.','https://simehbucket.s3.amazonaws.com/images/73f70f1551ef423b684c71e53f1afb2e-medium.jpg')

 create table editorial (
    id int primary key auto_increment,
    name varchar(200) not null,
    sitio_web varchar(500)
 );

 insert into editorial(id, name, sitio_web) values
 (1, 'Editorial UPTC', 'https://editorial.uptc.edu.co/'),
 (2, 'Panini', 'https://www.paninicomics.com/'),
 (3, 'Editorial UPTC', 'https://editorial.uptc.edu.co/');

alter table libro
add column editorial_id int,
add foreign key (editorial_id) references editorial(id);

update libro set editorial_id = 1 where id in (1, 3);
update libro set editorial_id = 2 where id in (2);
update libro set editorial_id = 3 where id in (3);

alter table libro
modify editorial_id int not null;
