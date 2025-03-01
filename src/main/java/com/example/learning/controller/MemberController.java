package com.example.learning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.learning.entity.MemberEntity;
import com.example.learning.repository.MemberRepository;
import org.springframework.ui.Model;

@Controller

public class MemberController {
	
	@Autowired
	MemberRepository repositoryMember;
	
	@GetMapping("newmember")
	public String newMember() {
		return "NewMember";
	}
	
	@PostMapping("savemember")
	public String saveMemebr(MemberEntity entityMember) {
		repositoryMember.save(entityMember);
		return"NewMember";
	}
	@GetMapping("listmember")
	public String listMember(Model model) {
		List<MemberEntity> memberList =repositoryMember.findAll();
		model.addAttribute("memberlist", memberList);
		return "ListMember";
	}
	@GetMapping("viewmember")
	public String viewmember(Integer memberId,Model model) {
		System.out.println("id ===>" +memberId); 
		Optional<MemberEntity> op =repositoryMember.findById(memberId);
		if(op.isEmpty()) {
			
		}else {
			MemberEntity member=op.get();
			model.addAttribute("member", member);
		}
		return"ViewMember";
	}
	@GetMapping("deletemembers")
	public String deletemembers(Integer memberId) {
		repositoryMember.deleteById(memberId);
		return"redirect:/listmember";
	}
	

}
