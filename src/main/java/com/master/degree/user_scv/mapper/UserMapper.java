package com.master.degree.user_scv.mapper;

import com.master.degree.user_scv.model.UserSaveDto;
import com.master.degree.user_scv.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User toStudent(UserSaveDto dto);

}
