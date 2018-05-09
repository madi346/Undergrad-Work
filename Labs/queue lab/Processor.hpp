#ifndef _PROCESSOR
#define _PROCESSOR

#include <iostream>
#include <string>
#include <iomanip>
#include <fstream>
using namespace std;

#include "Job.hpp"
#include "Queue.hpp"

class Processor
{
public:
	void FirstComeFirstServe(vector<Job>& allJobs, Queue<Job*>& jobQueue, const string& logFile);
	void RoundRobin(vector<Job>& allJobs, Queue<Job*>& jobQueue, int timePerProcess, const string& logFile);
};

void Processor::FirstComeFirstServe(vector<Job>& allJobs, Queue<Job*>& jobQueue, const string& logFile)
{
	//opening and writing to an output file
	ofstream output(logFile);
	output << "First Come First Served (FCFS)" << endl;

	int cycles = 0;

	output << "Cycles" << setw(10) << "Job ID" << setw(20) << "Remaining" << endl;

	while (jobQueue.Size() > 0) {

		//process the front most item
		jobQueue.Front()->Work(FCFS);

		output << cycles << setw(10)
			<< jobQueue.Front()->id << setw(20)
			<< jobQueue.Front()->fcfs_timeRemaining << endl;


		//if the front most items done variable then 
		if (jobQueue.Front()->fcfs_done) {

			//set the front-most items finished time 
			jobQueue.Front()->SetFinishTime(cycles, FCFS);

			//pop the item off the queue
			jobQueue.Pop();

			if (jobQueue.Size() > 0) {
				output << endl << endl << "-----------------------------" << endl
					<< "Processing job # " << jobQueue.Front()->id << endl << endl;
			}
		}
		//increment the cycle counter
		cycles++;

	}

	float averageSum = 0;
	output << endl << endl << "----------------------------------------------------\n\n"
		<< "First come, first serve results: \n\n" << "JOB ID " << setw(20)
		<< "TIME TO COMPLETE" << endl;

	for (unsigned int i = 0; i < allJobs.size(); i++) {
		averageSum += allJobs[i].fcfs_finishTime;
		output << allJobs[i].id
			<< setw(15) << allJobs[i].fcfs_finishTime
			<< endl;
	}
	output << "\nTotal Time: " << cycles << "\n\nAverage Time: " << (averageSum / allJobs.size());



	// now close the file
	output.close();
}

void Processor::RoundRobin(vector<Job>& allJobs, Queue<Job*>& jobQueue, int timePerProcess, const string& logFile)
{
	ofstream output(logFile);
	output << "Round Robin (RR) " << endl;

	int cycles = 0;
	int timer = 0;

	output << "Cycles" << setw(10) << "Job ID" << setw(20) << "Remaining" << setw(20) << "Interrupted" << endl;

	while (jobQueue.Size() > 0) {

		if (timer == timePerProcess) {
			jobQueue.Front()->rr_timesInterrupted += 1;
			jobQueue.Push(jobQueue.Front());
			jobQueue.Pop();
			timer = 0;

			output << endl << endl << "-----------------------------" << endl
				<< "Processing job # " << jobQueue.Front()->id << endl << endl;
		}

		jobQueue.Front()->Work(RR);
		output << cycles << setw(10)
			<< jobQueue.Front()->id << setw(20)
			<< jobQueue.Front()->rr_timeRemaining << setw(20)
			<< jobQueue.Front()->rr_timesInterrupted << endl;

		if (jobQueue.Front()->rr_done) {
			//set the front-most items finished time 
			jobQueue.Front()->SetFinishTime(cycles, RR);

			//pop the item off the queue
			jobQueue.Pop();
		}
		cycles++;
		timer++;
	}

	float averageSum = 0;
	output << endl << endl << "----------------------------------------------------\n\n"
		<< "Round Robin Results: \n\n" << "JOB ID" << setw(20)
		<< "TIME TO COMPLETE" << setw(20)
		<< "TIMES INTERRUPTED" << endl;

	for (unsigned int i = 0; i < allJobs.size(); i++) {
		averageSum += allJobs[i].rr_finishTime;
		output << allJobs[i].id
			<< setw(15) << allJobs[i].rr_finishTime
			<< setw(15) << allJobs[i].rr_timesInterrupted
			<< endl;
	}
	output << "\nTotal Time: " << cycles << "\n\nAverage Time: " << (averageSum / allJobs.size())
		<< "\n\nRound Robin Interval: " << timePerProcess;


	output.close();
}

#endif
