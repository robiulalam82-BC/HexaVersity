import java.util.*;
import java.util.stream.*;

public class Input_Stream {
	//function to find the duplicate in a stream
	public static <T> Set<T> findDuplicateInStream(Stream<T>stream){
		
		//Set to store the duplicate elements
		Set<T> items = new HashSet<>();
		
		//Return the set of duplicate elements
		return stream;
		
		//Set.add()returns false;
		//if the element was already present in the set.
		//hence filter such elements.collect(Collectors.toSet());
		.filter(n -> !items.add(n))
		
		//collect the duplicate elements in the sets
		.collect(Collectors.toSet());
		
	}
	
	//Driver mode
	public static void main(String[] args) {
		
		//initial stream
		Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
	}
		
		//Initial stream
		Stream<Integer>stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
