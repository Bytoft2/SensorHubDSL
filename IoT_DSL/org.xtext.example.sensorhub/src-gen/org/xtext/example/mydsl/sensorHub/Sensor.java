/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.sensorHub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sensorHub.Sensor#getRate <em>Rate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sensorHub.Sensor#getPreprocessor <em>Preprocessor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sensorHub.Sensor#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject
{
  /**
   * Returns the value of the '<em><b>Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' attribute.
   * @see #setRate(int)
   * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getSensor_Rate()
   * @model
   * @generated
   */
  int getRate();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sensorHub.Sensor#getRate <em>Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' attribute.
   * @see #getRate()
   * @generated
   */
  void setRate(int value);

  /**
   * Returns the value of the '<em><b>Preprocessor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preprocessor</em>' containment reference.
   * @see #setPreprocessor(PreProcessor)
   * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getSensor_Preprocessor()
   * @model containment="true"
   * @generated
   */
  PreProcessor getPreprocessor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sensorHub.Sensor#getPreprocessor <em>Preprocessor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preprocessor</em>' containment reference.
   * @see #getPreprocessor()
   * @generated
   */
  void setPreprocessor(PreProcessor value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.sensorHub.SensorHubPackage#getSensor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sensorHub.Sensor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Sensor
