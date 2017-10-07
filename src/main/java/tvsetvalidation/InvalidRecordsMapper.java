package tvsetvalidation;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class InvalidRecordsMapper extends Mapper<LongWritable, Text, Text, Text> {

	@Override
	public void setup(Context context) {
	}

	@Override
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		String[] lineArray = value.toString().split("\\|");
		if (!lineArray[0].equals("NA") && !lineArray[1].equals("NA")) {
			context.write(new Text(), value);
		}
	}
}
