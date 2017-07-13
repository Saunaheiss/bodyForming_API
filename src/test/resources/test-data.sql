delete from trainer_user_photos; 
delete from trainer_user_experience;
delete from trainer_user;
delete from user;
delete from review;
delete from skills;
delete from skills_endorsed_trainer;
delete from skills_endorsments;
delete from trainer_user_skills;

insert into trainer_user(id,first_name, last_name, email, password, personal_photo, conclusion, philosophy) values(1,'Usain', 'Bolt', 'usain.bolt@bolt.com', 'testpw', 'https://static.independent.co.uk/s3fs-public/thumbnails/image/2015/01/19/17/usain-bolt-pose.jpg', 'Usain St Leo "Lightning" Bolt, OJ, CD (born 21 August 1986) is a Jamaican sprinter and currently the fastest human in the world. He is the first person to hold both the 100 metres and 200 metres world records since fully automatic time became mandatory.', 'Meine Philosophie ist wie jeder mag');

insert into trainer_user_experience(trainer_user_id, experience) values (1, 'First appearance on world stage was at the 2001 IAAF World Youth Championships. There he failed.');
insert into trainer_user_experience(trainer_user_id, experience) values (1, 'He became the youngest world-junior gold medallist ever.');
insert into trainer_user_experience(trainer_user_id, experience) values (1, 'He became the first junior sprinter to run the 200 m in under twenty seconds.');
insert into trainer_user_experience(trainer_user_id, experience) values (1, 'On the 31. May 2008 Bolt won in 100 meters with new world record 9.72s');

insert into trainer_user_photos(trainer_user_id, photos) values (1, 'http://i2.cdn.cnn.com/cnnnext/dam/assets/121205034020-pmt-usain-bolt-before-the-race-00011624-story-top.jpg');
insert into trainer_user_photos(trainer_user_id, photos) values (1, 'http://i2.cdn.cnn.com/cnnnext/dam/assets/160815202407-usain-bolt-smiles-jeanne-moos-pkg-large-169.jpg');
insert into trainer_user_photos(trainer_user_id, photos) values (1, 'http://healthyceleb.com/wp-content/uploads/2016/01/Usain-Bolt-shirtless-body.jpg');

insert into trainer_user(id,first_name, last_name, email, password, personal_photo, conclusion, philosophy) values(2,'Jürgen', 'Klinsmann', 'juergen.klinsmann@t-online.de', 'testpw', 'http://bilder.augsburger-allgemeine.de/img/bundesliga/crop9507971/3057219949-ctopTeaser/Juergen-Klinsmann-hat-immer-eine-klare-Meinung.jpg', 'Jürgen Klinsmann (born 30 July 1964) is a German football manager and former player who was most recently the head coach of the United States mens national soccer team. As a player, Klinsmann played for several prominent clubs in Europe and was part of the West German team that won the 1990 FIFA World Cup and the unified German team that won the 1996 UEFA European Championship. One of Germanys premier strikers during the 1990s, he scored in all six major international tournaments he participated in, from Euro 1988 to 1998 World Cup. In 1995, he came in third in the FIFA World Player of the Year award; in 2004 he was named in the FIFA 100 list of the "125 Greatest Living Footballers".', 'Meine Philosophie ist wie jeder mag');

insert into trainer_user_experience(trainer_user_id, experience) values (2, 'Medizinstudium');
insert into trainer_user_experience(trainer_user_id, experience) values (2, 'Discopumper für 5 Jahre');

insert into trainer_user_photos(trainer_user_id, photos) values (2, 'http://www.sportschau.de/fussball/international/juergen-klinsmann-108~_v-gseagaleriexl.jpg');
insert into trainer_user_photos(trainer_user_id, photos) values (2, 'http://polpix.sueddeutsche.com/polopoly_fs/1.481419.1357498732!/httpImage/image.jpg_gen/derivatives/900x600/image.jpg?method=resize');

insert into trainer_user(id,first_name, last_name, email, password, personal_photo, conclusion, philosophy) values(3,'Arnold', 'Schwarzenegger', 'arnold.schwarzenegger@schwarzenegger.com', 'testpw', 'http://www.indiewire.com/wp-content/uploads/2014/05/the-terminator.jpg', 'Arnold Alois Schwarzenegger (born July 30, 1947) is an Austrian-American actor, producer, businessman, investor, author, philanthropist, activist, politician and former professional bodybuilder. He served two terms as the 38th Governor of California from 2003 to 2011.', 'Meine Philosophie ist wie jeder mag');

insert into trainer_user_experience(trainer_user_id, experience) values (3, 'Medizinstudium');
insert into trainer_user_experience(trainer_user_id, experience) values (3, 'Discopumper für 5 Jahre');

insert into trainer_user_photos(trainer_user_id, photos) values (3, 'http://static1.businessinsider.com/image/54d3d5ca6da811bc678b456b-480/arnold-schwarzenegger.jpg');
insert into trainer_user_photos(trainer_user_id, photos) values (3, 'http://static2.blastingnews.com/media/photogallery/2017/5/27/660x290/b_586x276/arnold-schwarzenegger-on-his-plans-for-new-conan-movie-gamespot-gamespotcom_1351481.jpg');

insert into user (id, first_name, last_name, email, password) values (1, 'Tobias', 'Hoffmann', 'hoffman@test.ch', 'password');

insert into review(id, comment, rating, reviewed_id, reviewer_id) values (1, 'review: this the first review', 4, 1, 1);

insert into skills(id, typeskill) values (1, 'Marathontrainer');

insert into skills_endorsed_trainer(skills_id, endorsed_trainer_id) values (1, 1);

insert into skills_endorsments(skills_id, endorsments_id) values (1, 1);

insert into trainer_user_skills(trainer_user_id, skills_id) values (1, 1);