package com.sanqing.service;

import com.sanqing.po.User;

public abstract interface UserService
{
  public abstract String addUser(User paramUser);

  public abstract String loginValidate(User paramUser);

  public abstract Integer getUserID(User paramUser);
}

