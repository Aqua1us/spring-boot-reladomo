package com.amtkxa.springbootreladomo.domain.model;
import com.gs.fw.finder.Operation;
import java.util.*;
public class CustomerAccountList extends CustomerAccountListAbstract
{
	public CustomerAccountList()
	{
		super();
	}

	public CustomerAccountList(int initialSize)
	{
		super(initialSize);
	}

	public CustomerAccountList(Collection c)
	{
		super(c);
	}

	public CustomerAccountList(Operation operation)
	{
		super(operation);
	}
}
