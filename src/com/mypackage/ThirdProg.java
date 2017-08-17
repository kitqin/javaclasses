package com.mypackage;
import com.mypackage.tools.ITool;
import com.mypackage.tools.Hammer;
import com.mypackage.tools.Wrench;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class ThirdProg{

	public static void main(String[] args){
		ITool[] tools = new ITool[2];
		Hammer hammer = new Hammer();
		//System.out.println(hammer.name("small hammer"));
		Wrench wrench = new Wrench();
		tools[0] = hammer;
		tools[1] = wrench;
		for(int i =0;i<2;i++)
		{
			System.out.println(tools[i].name(Integer.toString(i)));
		}
		ArrayList<ITool> list = new ArrayList<ITool>();
		list.add(hammer);
		list.add(wrench);
		for (ITool tool: list){
			System.out.println(tool.name("no name"));
		}
		
		HashMap<String,ITool> map = new HashMap<String,ITool>();
		map.put("hammer 1",hammer);
		map.put("wrench 1",wrench);
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println("Key is: " + pair.getKey() + "Value is: "
			 + ((ITool)pair.getValue()).name(pair.getKey().toString()));
		}

		System.out.println(map.get("wrench 1").name("is it wrench one?"));

	}
}
