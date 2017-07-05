delete from trainer_user_photos; 
delete from trainer_user_experience;
delete from trainer_user;
delete from user;
delete from review;
delete from skills;
delete from skills_endorsed_trainer;
delete from skills_endorsments;
delete from trainer_user_skills;

insert into trainer_user(id,first_name, last_name, email, password, personal_photo, conclusion, philosophy) values(1,'Karsten', 'Nordhausen', 'test@test.ch', 'testpw', 'http://www.aachener-zeitung.de/polopoly_fs/1.5894.1346145640!/httpImage/image.jpg_gen/derivatives/zva_quer_540/image.jpg', 'conclusion: Erfahrender Mediziner mit liebe zum Eisensport', 'Meine Philosophie ist wie jeder mag');

insert into trainer_user_experience(trainer_user_id, experience) values (1, 'Medizinstudium');
insert into trainer_user_experience(trainer_user_id, experience) values (1, 'Discopumper für 5 Jahre');

insert into trainer_user_photos(trainer_user_id, photos) values (1, 'http://de.myprotein.com/thezone/wp-content/uploads/2015/04/Vergessene-Faktoren-der-Leistungssteigerung-im-Kraftsport.jpg');
insert into trainer_user_photos(trainer_user_id, photos) values (1, 'http://scontent.cdninstagram.com/t51.2885-15/s480x480/e35/c0.135.1080.1080/12568142_795970540531554_695733441_n.jpg?ig_cache_key=MTE2OTY3ODM1Mzk2NTk3MTcwNw%3D%3D.2.c');



insert into user (id, first_name, last_name, email, password) values (1, 'Tobias', 'Hoffmann', 'hoffman@test.ch', 'password');

insert into review(id, comment, rating, reviewed_id, reviewer_id) values (1, 'review: this the first review', 4, 1, 1);

insert into skills(id, typeskill) values (1, 'Marathontrainer');

insert into skills_endorsed_trainer(skills_id, endorsed_trainer_id) values (1, 1);

insert into skills_endorsments(skills_id, endorsments_id) values (1, 1);

insert into trainer_user_skills(trainer_user_id, skills_id) values (1, 1);