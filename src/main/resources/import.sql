insert into roles(role) values('ROLE_ADMIN');
insert into roles(role) values('ROLE_USER');
insert into roles(role) values('ROLE_SALES');
insert into users(email,password,is_expired,is_enable,is_locked,non_expired_password) values('logavdm@gmail.com','demodemo',0,1,0,1);
insert into users(email,password,is_expired,is_enable,is_locked,non_expired_password) values('logavdm1@gmail.com','demodemo',0,1,0,1);
insert into users(email,password,is_expired,is_enable,is_locked,non_expired_password) values('logavdm3@gmail.com','demodemo',0,1,0,1);
insert into user_roles(user_id,role_id) values(1,1);
insert into user_roles(user_id,role_id) values(2,2);


insert into oauth_client_details(client_id,resource_ids,client_secret,scope,authorized_grant_types,access_token_validity,refresh_token_validity,additional_information) values('loga','restservice','nathan','read,write','password,refresh_token','900','10000','{}');
insert into oauth_client_details(client_id,resource_ids,client_secret,scope,authorized_grant_types,access_token_validity,refresh_token_validity,additional_information) values('logavdm@gmail.com','restservice','demodemo','read,write','password,refresh_token','900','10000','{}');
