package com.sanqing.dao;

import com.sanqing.po.User;

public abstract interface UserDAO
{
  public abstract String login(User paramUser);

  public abstract String register(User paramUser);

  public abstract Integer getUserID(User paramUser);
}

