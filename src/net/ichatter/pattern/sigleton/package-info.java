/**
 * <ul>
 * <li>1.<b>Lazy initialization</b> the instance of Singleton Class is not
 * created at the time of class loading.
 * 
 * <li>2.<b>Eager initialization</b>, the instance of Singleton Class is created
 * at the time of class loading, this is the easiest method to create a
 * singleton class but it has a drawback that instance is created even though
 * client application might not be using it.
 * 
 * <li>3.<b>Static inner class</b>, when the singleton class is loaded,
 * SingletonHelper class is not loaded into memory and only when someone calls
 * the getInstance method, this class gets loaded and creates the Singleton
 * class instance.This is the most widely used approach for Singleton class as
 * it doesn't require synchronization.
 * </ul>
 * 
 * @author yzy
 *
 */
package net.ichatter.pattern.sigleton;