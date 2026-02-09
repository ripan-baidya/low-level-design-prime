/**
 * Prototype interface
 *
 * @param <T> type of object to be cloned
 */
public interface Prototype<T> {

  /**
   * Clone object
   *
   * @return cloned object
   */
  T clone();
}
