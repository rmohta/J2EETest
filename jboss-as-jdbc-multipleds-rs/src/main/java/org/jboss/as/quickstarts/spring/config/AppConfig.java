package org.jboss.as.quickstarts.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <table>
 * <tr>
 * <th>Element</th><th>Description</th>
 * </tr>
 * <tr>
 * <td>org.springframework.context.annotation.Configuration</td>
 * <td>Marks this class as configuration class</td>
 * </tr>
 *
 * <tr>
 * <td>org.springframework.context.annotation.ComponentScan</td>
 * <td>Equivalent to &lt;context:component-scan base-package="" /&gt; </td>
 * </tr>
 * 
 * <tr>
 * <td></td>
 * <td></td>
 * </tr>

 * </table>
 * 
 * @author Rohit Mohta
 * @since Sep 23, 2014
 *
 */
@Configuration
@ComponentScan(basePackages={""})
public class AppConfig {

	
}
