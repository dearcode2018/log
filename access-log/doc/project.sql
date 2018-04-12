
/* 若存在先删除 */
DROP TABLE IF EXISTS `T_EXTERNAL_ACCESS_LOG`;
/* 创建 访问鉴权配置表 */
CREATE TABLE `T_EXTERNAL_ACCESS_LOG` (
	`ID` integer NOT NULL AUTO_INCREMENT comment '主键-自增长',
	`BUSINESS_ID` varchar(32) comment '业务ID, 一个请求对应一个业务ID',
	`ACCESS_CODE` varchar(16) comment '访问编号，让调用方携带该参数来识别不同的配置',	
	`REQUEST_PARAM` text comment '请求参数(json/xml)或url-form',
	`RESPONSE_RESULT` text comment '响应结果',
	`REQUEST_ADDR` varchar(64) comment '请求地址(IP)',
	`ENDURE_SECOND` int comment '持续秒数',
	`REMARK` varchar(1000) COMMENT '备注',		
	`CREATE_DT` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP() comment '访问时间',	
	 PRIMARY KEY (`ID`)
) ENGINE=InnoDB COMMENT '外部访问日志表' DEFAULT CHARSET=UTF8;



/* UUID.randomUUID().toString().replaceAll("-", "") */

/* mysql: sys_user */
create table sys_user (
	oid varchar(64) not null comment 'uuid',
	username varchar(64) not null comment '用户名',
	nickname varchar(64) comment '昵称 (用于显示)',
	password varchar(64) not null comment '密码',
	type varchar(24) not null default 'ADMIN-管理员, NORMAL-普通用户',
	status varchar(10) not null default 'ON' comment '用户状态 - 是否有效 默认 : 有效(ON) 无效(OFF)',
	primary key (oid)
) comment '用户表';

insert into sys_user(oid, username, nickname, password, type, status) 
values ('we546a75684sfaerw230', 'admin', 'Adaministrator', '123456', 'ADMIN', 'ON');

insert into sys_user(oid, username, nickname, password, type, status) 
values ('asdf34sv34zdfasf234', 'user', 'normal user', '123456', 'NORMAL', 'ON');

insert into sys_user(oid, username, nickname, password, type, status) 
values ('345sdf234sdfsf', 'me', 'normal me', '123456', 'NORMAL', 'OFF');

insert into sys_user(oid, username, nickname, password, type, status) 
values ('345sdf22asdfas34sdfsf', 'my', 'normal my', '123456', 'NORMAL', 'ON');



















