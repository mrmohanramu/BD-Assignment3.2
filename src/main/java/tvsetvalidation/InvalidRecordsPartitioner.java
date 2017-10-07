package tvsetvalidation;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class InvalidRecordsPartitioner extends Partitioner<IntWritable, IntWritable> {

	@Override
	public int getPartition(IntWritable key, IntWritable value, int numPartitions) {			
		if (key.get() <= 2010) {
			return 0;
		}
		else {
			return 1;
		}
	}
}