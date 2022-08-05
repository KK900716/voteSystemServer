package com.sics.votesystemserver.controller;

import com.sics.votesystemserver.pojo.VoteMessage;
import com.sics.votesystemserver.pojo.VoteResultMessage;
import com.sics.votesystemserver.pojo.enums.Code;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangjc
 * @version 2022/08/05
 */
@RestController
@CrossOrigin
public class ServeVoteWebBackController {
  @PostMapping("/server/vote")
  public VoteMessage t(){
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("张三");
    arrayList.add("李四");
    VoteMessage voteMessage = new VoteMessage();
    voteMessage.setMessage(Code.SUCCESS.getMessage());
    voteMessage.setCode(Code.SUCCESS.getCode());
    voteMessage.setData(arrayList);
    return voteMessage;
  }
  @PostMapping("/server/result")
  public VoteResultMessage ServerVoteResult(){
    HashMap<String, Double> hashMap = new HashMap<>();
    hashMap.put("张三", 56.4);
    hashMap.put("李四", 78.2);
    VoteResultMessage voteResultMessage = new VoteResultMessage();
    voteResultMessage.setMessage(Code.SUCCESS.getMessage());
    voteResultMessage.setCode(Code.SUCCESS.getCode());
    voteResultMessage.setData(hashMap);
    return voteResultMessage;
  }
}
