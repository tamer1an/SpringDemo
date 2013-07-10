package org.tamer1an.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

public class Circle implements Shape, ApplicationEventPublisherAware{
	
	private Point center;
	private ApplicationEventPublisher publisher;
	@Autowired
	private MessageSource messageSource;	

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	//	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()} , "Default greeting", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

	/**
	 * @return the center
	 */
	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("myCircle")
	public void setCenter(Point center) {
		this.center = center;
	}

	/**
	 * @return the publisher
	 */
	public ApplicationEventPublisher getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		setPublisher(publisher);
	}

}
