create database activiti
GO
use activiti
GO
-- user develop�����Կ���������ʱʹ�õ��û�
create user u_dev for login u_dev with default_schema=dbo
exec sp_addrolemember 'db_owner', 'u_dev'

-- user sys��ϵͳ����ʹ�õ��˻�
create user u_sys for login u_sys with default_schema=dbo
exec sp_addrolemember 'db_owner', 'u_sys'

-- user stuff
create user u_stuff for login u_stuff with default_schema=dbo
exec sp_addrolemember 'db_owner', 'u_stuff'

-- user admin
create user u_admin for login u_admin with default_schema=dbo
exec sp_addrolemember 'db_owner', 'u_admin'

-- user HR
create user u_HR for login u_HR with default_schema=dbo
exec sp_addrolemember 'db_owner', 'u_HR'