# MySpringSecurity
A demo for using spring security with mysql ！

# Dev Environment
My Dev environment is IntelliJ + gradle + MySQL




# MySQl Schema：(webgis is my project and schema name)
INSERT INTO `webgis`.`account` (`id`, `create_time`,`update_time`,`name`, `username`, `password`) VALUES ('1', now(),now(),'Tiandi', 'Xietiandi', '930912');

INSERT INTO `webgis`.`account` (`id`, `create_time`,`update_time`,`name`, `username`, `password`) VALUES ('2', now(),now(),'rain', 'heyu', '930912');


It's just a very easy account table. You can create your own user table and verity the uesrname and password by spring security!
