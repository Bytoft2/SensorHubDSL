/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.sensorHub;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sensorHub.SensorSystem#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sensorHub.SensorSystem#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getSensorSystem()
 * @model
 * @generated
 */
public interface SensorSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getSensorSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sensorHub.SensorSystem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.sensorHub.Device}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' containment reference list.
   * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getSensorSystem_Devices()
   * @model containment="true"
   * @generated
   */
  EList<Device> getDevices();

} // SensorSystem
