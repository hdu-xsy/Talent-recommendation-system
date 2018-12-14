use tal_rec_sys
GO

-- recommendAdd ����recommend����Ч��
create trigger recommendAdd on recommend for insert as
BEGIN
	IF (select count(*) from recommend where rec_rp_id=(select rec_rp_id from inserted) and rec_recsta_id>1)>1
		delete from recommend where rec_rp_id=(select rec_id from inserted)
	ELSE IF (select rp_vali from recommend_people where rp_id=(select rec_rp_id from inserted))='��'
		delete from recommend where rec_id=(select rec_id from inserted)
END