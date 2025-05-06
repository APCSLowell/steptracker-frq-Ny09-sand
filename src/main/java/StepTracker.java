import java.util.ArrayList;
public class StepTracker
{
 int min; int accumulate; int days ; int active; 
 StepTracker(int num_min){
  min=num_min;active=0;days=0;accumulate=0; 
 } 
 public void addDailySteps(int integer){
  accumulate +=integer; days++; 
  if(integer>=min) {active++;} 
 } 
 public int activeDays(){
  return active; 
 } 
 public double averageSteps(){
  if(days==0){return 0.0; }
  return (double)accumulate/days; 
 } 
} 
