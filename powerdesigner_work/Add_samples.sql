-- table role
insert into role values(0,'Admin��ӵ�����Ȩ��')
insert into role values(1,'stuff')
insert into role values(2,'HR')

-- table degree
insert into degree values(0,'����')

-- table department
insert into departments values(0,NULL,'��������')
insert into departments values(1,NULL,'���²���')
insert into departments values(2,NULL,'������')

-- table emergency_degree
insert into emergency_degree values(0,'һ��','��߼�������')

-- table work_place
insert into work_place values(0,'����','���������ݵ��ӿƼ���ѧ')

-- table university
insert into university values(0,'���ݵ��ӿƼ���ѧ')

-- table interview_place
insert into interview_place values(0,0,'һ¥���Դ���')

-- table interview_results
insert into interview_results values(0,'ͨ��')
insert into interview_results values(1,'��ͨ��')
insert into interview_results values(2,'������������')

-- table job_type
insert into job_type values(0,'������Ա','������Ա')
insert into job_type values(1,'������Ա','������Ա')
insert into job_type values(2,'������Ա','������Ա')

-- table job
insert into job values(0,0,'C++����Ա','C++����Ա',5000)
insert into job values(1,1,'HR','HR',2000)
insert into job values(2,2,'��Ŀ����','��Ŀ����',7000)

-- table points_change_rule
insert into points_change_rule values(0,'ͨ��ɸѡ�ӷ�',1)
insert into points_change_rule values(1,'ͨ���������Եȴ�����',2)
insert into points_change_rule values(2,'ͨ������',2)
insert into points_change_rule values(3,'��ְ',2)

-- table recommend_from
insert into recommend_from values(0,'Ա���Ƽ�')
insert into recommend_from values(1,'ɸѡ���Ƽ�')
insert into recommend_from values(2,'ͨ���������Ժ��Ƽ�')

-- table recommend_results ����stageΪ����ʱ��result�Ż���ֵ
insert into recommend_results values(0,'�����˲ſ�')
insert into recommend_results values(1,'������������')
insert into recommend_results values(2,'������offer')
insert into recommend_results values(3,'�ܾ�offer')
insert into recommend_results values(4,'����offer����ְ')

-- table recommend_stage
insert into recommend_stage values(0,'����')
insert into recommend_stage values(1,'�ȴ�ɸѡ')
insert into recommend_stage values(2,'�ȴ���������')
insert into recommend_stage values(3,'�ȴ���������')
insert into recommend_stage values(4,'�ȴ�offerȷ��')
insert into recommend_stage values(5,'�ȴ���ְ')

-- table talents_from
insert into talents_from values(0,'δͨ��ɸѡ����')
insert into talents_from values(1,'ͨ��ɸѡ�����')
insert into talents_from values(2,'ͨ���������Ժ����')

-- table stuff_type
insert into stuff_type values(0,'FTE','Full Time Employee')
insert into stuff_type values(1,'PTE','Part Time Employee')

-- table stuff
insert into stuff values(0,0,0,'С��',20,'��','h','123','xm@163.com',0,'18711111111')
insert into stuff values(1,1,1,'С��',20,'Ů','hh','123','xh@163.com',0,'18711111111')
insert into stuff values(2,2,2,'С��',20,'��','hhh','123','xb@163.com',0,'18711111111')