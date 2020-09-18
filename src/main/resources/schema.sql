drop database if exists expenses_db;

-- DB作成
CREATE DATABASE expenses_db;

use expenses_db;

-- テーブル作成
-- users_tblの作成
create table users_tbl (
  user_id int(11) not null comment 'ユーザーID'
  , login_id varchar(30) not null comment 'ログインID'
  , user_name varchar(10) not null comment 'ユーザー名'
  , login_pw varchar(20) not null comment 'ログインPW'
  , authority boolean not null comment '権限 1:承認棄却権限あり 0:承認棄却権限なし'
  , is_user varchar(10) comment 'データ作成者'
  , is_date date comment 'データ作成日時'
  , upd_user varchar(10) comment '更新者'
  , upd_date date comment '更新日時'
  , is_deleted boolean default 0 comment '削除フラグ 1:有効 0:無効'
)
  comment='ユーザーテーブル'
;


-- 主キーの作成
alter table users_tbl  add constraint users_tbl_pk primary key (user_id)
;


-- list_tblの作成
create table list_tbl (
  expenses_id int(11) not null comment '経費管理ID'
  , user_id int(11) not null comment 'ユーザーID'
  , content_id int(11) not null comment 'コンテンツID'
  , status_id int(11) not null comment 'ステータスID'
  , money int(11) not null comment '金額'
  , reason Varchar(20) comment '処理理由'
  , is_user varchar(10) comment 'データ作成者'
  , is_date date comment 'データ作成日時'
  , upd_user varchar(10) comment '更新者'
  , upd_date date comment '更新日時'
  , is_deleted boolean default 0 comment '削除フラグ 1:有効 0:無効'
)
  comment='申請一覧テーブル'
;


-- 主キーの作成
alter table list_tbl  add constraint list_tbl_pk primary key (expenses_id)
;



-- content_tblの作成
create table content_tbl (
  content_tbl int(11) not null comment 'コンテンツID'
  , content_application Varchar(10) not null comment '申請内容'
  , is_user Varchar(10) comment 'データ作成者'
  , is_date date comment 'データ作成日時'
  , upd_user Varchar(10) comment '更新者'
  , upd_date date comment '更新日時'
  , is_deleted boolean default 0 comment '削除フラグ 1:有効 0:無効'
)
  comment='申請内容テーブル'
;


-- 主キーの作成
alter table content_tbl  add constraint content_tbl_pk primary key (content_tbl)
;


-- status_tblの作成
create table status_tbl (
  status_tbl int(11) not null comment 'ステータスID'
  , status_name Varchar(10) not null comment 'ステータス名'
  , is_user Varchar(10) comment 'データ作成者'
  , is_date date comment 'データ作成日時'
  , upd_user Varchar(10) comment '更新者'
  , upd_date date comment '更新日時'
  , is_deleted boolean default 0 comment '削除フラグ 1:有効 0:無効'
)
  comment='ステータステーブル'
;


-- 主キーの作成
alter table status_tbl  add constraint status_tbl_pk primary key (status_tbl)
;
