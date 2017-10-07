package tvsetvalidation;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class InvalidRecordsReducer extends Reducer<IntWritable, IntWritable, IntWritable, IntWritable>
{	
	
	@Override
	public void setup(Context context) {
	}
	
	public void reduce(Text str, Iterable<Text> values,Context context) throws IOException, InterruptedException
	{
	}
}
