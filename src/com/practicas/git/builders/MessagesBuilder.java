package com.practicas.git.builders;

import java.util.ArrayList;

public class MessagesBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<ChannelsMoSubs> channelsContent = new ArrayList<ChannelsMoSubs>();
		
		for(int i = 0; i < 255; i++){
			
			channelsContent.add(new ChannelsMoSubs("10" + i, "43" + i, "102" + i, "name" + i, "today"));
		} 

		ArrayList<String> messages = new ArrayList<String>();
		
		StringBuffer messagebuilder = null;
		
		String prefix = "Canales obsoletos, sin contenido:";
		
		boolean notExcess = true;
		
		Integer index = 0;
		
		Integer limitMessage = 160;
		
		Integer limitChannels = channelsContent.size();
		
		while(notExcess){
			
				if (messagebuilder == null){ 
					
					messagebuilder = new StringBuffer();
					messagebuilder.append(prefix); 
				}
				
				messagebuilder.append(channelsContent.get(index).getChannelId());
				
				if (messagebuilder.length() < limitMessage && ((index + 1) < limitChannels)){
					
					if ((index + 1) <= limitChannels){
						
						Integer expectLength = messagebuilder.length() + channelsContent.get(index + 1).getChannelId().length();
						
						if (expectLength > limitMessage){
							messages.add(messagebuilder.toString());
							index = index + 1;
							messagebuilder = null;
						} else {
							messagebuilder.append(",");
							index = index + 1;
						}
					}					
				} else {
					messages.add(messagebuilder.toString());
					messagebuilder = null;
					index = index + 1;
					
					if (index == limitChannels) {
						notExcess = false;
					}
				}
			
		}
		
		System.out.println(messages.size());
		
		for (String n : messages){
			System.out.println(n);
		}
	}

}
