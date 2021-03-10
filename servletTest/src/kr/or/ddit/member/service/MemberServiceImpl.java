package kr.or.ddit.member.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.vo.MemberVO;


public class MemberServiceImpl implements IMemberService {
	// Service객체는 Dao객체를 사용하기 때문에
	// Dao객체가 저장될 변수가 필요하다.
	private IMemberDao memDao;
	private static MemberServiceImpl service;
	
	// 생성자
//	public MemberServiceImpl(){
	private MemberServiceImpl(){
//		memDao = new MemberDaoImpl();
		memDao = MemberDaoImpl.getInstance();
	}
	public static MemberServiceImpl getInstance(){
		if(service == null) service = new MemberServiceImpl();
		return service;
	}
	
	@Override
	public int insertMember(MemberVO memVo) {
		return memDao.insertMember(memVo);
	}

	@Override
	public int deleteMember(String memId) {
		return memDao.deleteMember(memId);
	}

	@Override
	public int updateMember(MemberVO memVo) {
		return memDao.updateMember(memVo);
	}

	@Override
	public List<MemberVO> getAllMember() {
		return memDao.getAllMember();
	}

	@Override
	public int getMemberCount(String memId) {
		return memDao.getMemberCount(memId);
	}


	@Override
	public int updateMember2(Map<String, String> paramMap) {
		return memDao.updateMember2(paramMap);
	}

}
