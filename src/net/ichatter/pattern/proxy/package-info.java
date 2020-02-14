/**
 * <ul>
 * <li>1.<b>static proxy</b> is the simplest proxy pattern,but it's
 * hard-coded,not convenient to extend.
 * 
 * <li>2.<b>jdk dynamic proxy</b> need the proxied class implements an
 * interface.
 * 
 * <li>3.<b>cglib</b> based dynamic proxy need the 3rd party dependency
 * libraries,it can generate the subclass bytecode of proxied class
 * dynamically.This tech is widely used in many frameworks,such as
 * Spring,Hibernate,etc.
 * </ul>
 * 
 * @author yzy
 *
 */
package net.ichatter.pattern.proxy;