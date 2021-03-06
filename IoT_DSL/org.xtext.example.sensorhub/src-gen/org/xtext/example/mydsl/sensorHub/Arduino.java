/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.sensorHub;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sensorHub.Arduino#getRate <em>Rate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sensorHub.Arduino#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getArduino()
 * @model
 * @generated
 */
public interface Arduino extends EObject
{
  /**
   * Returns the value of the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' attribute.
   * @see #setRate(int)
   * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getArduino_Rate()
   * @model
   * @generated
   */
  int getRate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sensorHub.Arduino#getRate <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' attribute.
   * @see #getRate()
   * @generated
   */
  void setRate(int value);

  /**
   * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.sensorHub.Sensor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensors</em>' containment reference list.
   * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getArduino_Sensors()
   * @model containment="true"
   * @generated
   */
  EList<Sensor> getSensors();

} // Arduino
